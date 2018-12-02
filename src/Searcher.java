/* **********************************************************
 * Programmer:	Shae McFadden
 * Class:	CS40S
 * 
 * Assignment:	Assignment Two Searcher Class
 *
 * Description:	Will have a default constructor with a method for 
 *              linear and binary search
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class Searcher
 {  // begin class
 	
 	// *********** class constants **********
 	
 	// ********** instance variable **********
 	
 	// ********** constructors ***********
 	
        /*****************************************************
        // Purpose: default constructor
        // Interface: IN: None
        // Returns: None
        // *****************************************************/  
         public Searcher(){
         }//end of default constructor
     
 	// ********** Methods **********
        
        /*****************************************************
        // Purpose: searches for first occurs of key value through
        //          linear search
        // Interface: IN: array --> list
        //                int --> length
        //                int --> key
        // Returns: int
        // *****************************************************/  
        public int linearSearch(int[] list, int length, int key){
            int index = -1;//index of value searched for, value for not founded
            boolean sc = false; //boolean for if search is complete
            int i = 0; //index
            
            while(!sc && i<length){
                if (list[i] == key){
                    sc = true;
                    index = i;
                }//end of if
                else{
                    i++;
                }//end of else
            }//end of while loop
            
            return index; 
        }//end of linearSearch
        
        /*****************************************************
        // Purpose: searches for first occurs of key value through
        //          binary search
        // Interface: IN: array --> list
        //                int --> length
        //                int --> key
        // Returns: int
        // *****************************************************/  
        public int binarySearch(int[] list, int length, int key){
            int index = -1;//index of value searched for, value for not founded
            boolean sc = false; //boolean for if search is complete
            int low = 0; //first index
            int high = length-1; //last index
            int mid = high/2; //index in the middle
            int pass = 0; //number of passes
            int wc = 10; //amount of passes for worst case
            while(!sc && pass <= wc){
                if(list[mid] < key){
                    low = mid-1;
                }//end of less than if
                else if(list[mid] > key){
                    high = mid+1;
                }//end of greater then else if
                else {
                sc = true; //search is complete
                index = mid;
                }//end of else
                    
                mid = (high+low)/2; //finds new mid
                pass++; //increments for one pass
            }//end of while loop
            
            return index; 
        }//end of binarySearch
 
 }  // end class