/* **********************************************************
 * Programmer:	Shae McFadden
 * Class:	CS30S
 * 
 * Assignment:	Assignment Two Sorter Class
 *
 * Description: Will have a default constructor with a method for 
 *              bubble sort, selection sort, and quick sort
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class Sorter
 {  // begin class
 	
 	// *********** class constants **********
 	
 	
 	// ********** instance variable **********
 	
 	// ********** constructors ***********
 	
 	// ********** accessors **********
 	
        /*****************************************************
        // Purpose: sorts the list in ascending order
        // Interface: IN: array --> list
        //                int --> length
        // Returns: None??
        // *****************************************************/  
        public void bubbleSort(int[] list, int length){
            int x = 0; //variable for data swap
            int y = 0; //variable for data swap
            
            while(length>1){
                for(int i = 0; i < length; i++){
                    if(list[i]>list[i+1]){
                        x = list[i];
                        y = list[i+1];
                        
                        list[i] = y;
                        list[i+1] = x;
                    }//end of if
                }//end of for
                length--;
            }//end of while
        }//end of bubbleSort
        
        /*****************************************************
        // Purpose: sorts the list in ascending order
        // Interface: IN: array --> list
        //                int --> length
        // Returns: None??
        // *****************************************************/  
        public void selectionSortSort(int[] list, int length){
            int ind = 0; //variable for data swap
            int x = 0; //variable for data swap
            int y = 0; //variable for data swap
            
            while(length>0){
                for(int i = 0; i < length; i++){
                    if(list[i]>list[i+1]){
                        ind = i;
                    }//end of if
                }//end of for
                length--;
                
                x = list[ind];
                y = list[length];

                list[ind] = y;
                list[length] = x;        
            }//end of while
        }//end of bubbleSort
     
 	// ********** mutators **********
 
 }  // end class