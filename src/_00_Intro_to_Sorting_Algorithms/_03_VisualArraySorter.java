package _00_Intro_to_Sorting_Algorithms;

import processing.core.PApplet;

/*
 * Goal: Create a program that sorts each rectangle by height!
 * 
 * 1. Create an array of ints. Do not initialize it.
 *
 *In the settings() method:
 * 2. Set the size of your window to at least 500 width 500 height
 * 
 * In the setup() method:
 * 3. Initialize your array to contain 50 ints
 * 
 * 4. Initialize the ints in the array with random numbers from
 *    0 to the window height. Use the following code to get a random int:
 *    (int)random(height)
 * 
 * 5. Call the noStroke() method to remove the outline for each shape
 * 
 * In the draw() method:
 * 6. Set the background color with background(r, g, b);
 * 
 * 7. Set the color for your graph using the fill() method
 * 
 * 8. Draw a rectangle for each int in your array.
 *    the x value will be the loop variable multiplied by (width/intArray.length)
 *    the y value will the height variable
 *    the width is (width/intArray.length)
 *    the height is the negative array value at the array index, e.g. -intArray[i]
 * 
 * 9. Call the stepSort method
 * 
 * 10. Extract the code from step 4 that randomizes the array into a new method.
 * 
 * 11. Call the method you made in step 10 when the mouse is pressed using the
 *     mousePressed variable
 */
public class _03_VisualArraySorter extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    static int[] heights;
    @Override
    public void settings() {
        setSize(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        heights = new int[50];
        noStroke();
    }


    @Override
    public void draw() {
        background(0,0,0);
        fill(255,255,255);
        for (int i = 0; i<heights.length; i++){
            float x = i*((float)(WIDTH /heights.length));
            float y = heights[i];
            float w = (float) WIDTH /heights.length;
            float h = -heights[i];
            rect(i*((float) WIDTH /heights.length), heights[i], (float) WIDTH /heights.length,-heights[i]);
            System.out.println("x: "+x+", y: "+y+", w: "+w+", h: "+h);
            stepSort(heights);
        }
    }

    @Override
    public void mousePressed() {
        randomizeHeights();
    }
    public void randomizeHeights() {
        for (int i = 0; i<heights.length; i++){
            heights[i] = (int) random(HEIGHT);
        }
    }
    static public void main(String[] passedArgs) {
        PApplet.main(_03_VisualArraySorter.class.getName());
    }
    
    /*********************** DO NOT MODIFY THE CODE BELOW ********************/
    
    int startIndex = 1;

    void stepSort(int[] arr) {
      for (int i = startIndex; i < arr.length; i++) {
        if (arr[i - 1] > arr[i]) {
          int t = arr[i];
          arr[i] = arr[i - 1];
          arr[i - 1] = t;

          startIndex = i;
          return;
        }
      }
      startIndex = 1;
    }
}