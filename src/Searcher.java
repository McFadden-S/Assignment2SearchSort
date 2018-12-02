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
        // Purpose: sorts the list in ascending order through bubble
        //          sort method
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
 
 }  // end class