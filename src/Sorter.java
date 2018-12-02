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
 	
        //public void testPrint(int[]l)
     
        // ********** mutators **********
        
        /*****************************************************
        // Purpose: sorts the list in ascending order through bubble
        //          sort method
        // Interface: IN: array --> list
        //                int --> length
        // Returns: None??
        // *****************************************************/  
        public void bubbleSort(int[] list, int length){
            int x = 0; //variable for data swap
            int y = 0; //variable for data swap
            
            while(length>1){
                for(int i = 0; i < length-1; i++){
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
        // Purpose: sorts the list in ascending order through selection
        //          method
        // Interface: IN: array --> list
        //                int --> length
        // Returns: None??
        // *****************************************************/  
        public void selectionSortSort(int[] list, int length){
            int ind = 1; //indicator of highest value starts at second value
            int x = 0; //variable for data swap
            int y = 0; //variable for data swap
            length--;
            
            while(length>0){
                for(int i = 0; i <= length; i++){
                    if(list[i]>list[ind]){
                        ind = i;
                    }//end of if
                }//end of for
                
                x = list[ind];
                y = list[length];

                list[ind] = y;
                list[length] = x; 
                
                ind = 1;
                length--;
                
            }//end of while
        }//end of selectionSort
        
        
        /*****************************************************
        // Purpose: recursive function to quick sort
        // Interface: IN: array --> list
        //                int --> index low
        //                int --> index high
        // Returns: None??
        // *****************************************************/  
        public void quickSort(int[] list, int low, int high){
            
            if (low<high){
                
                int part = partition(list, low, high);
                
                quickSort(list, low, part-1);
                quickSort(list, part+1, high);
            }//end of if 
        }//end of qSort
        
        /*****************************************************
        // Purpose: Performs partitioning for quick sort
        // Interface: IN: array --> list
        //                int --> index low
        //                int --> index high
        // Returns: None??
        // *****************************************************/  
        public int partition(int[] list, int low, int high){
            int pivot = list[high]; //sets pivot to end of range
            int j = low; //sets index for smaller element
            int x,y = 0; //variables for data swap
            
            for(int i = low; i<=high-1; i++){
                if(list[i] <= pivot){
                    
                    
                    x = list[i];
                    y = list[j];
                    
                    list[i] = y;
                    list[j] = x;
                    
                    j++;
                }//end of if
            }//end of for loop
            
            x = list[j];
            y = list[high];

            list[j] = y;
            list[high] = x;
            
            return(j);
        }//end of partition
 
 }  // end class