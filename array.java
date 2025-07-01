class array {
    public static void main(String[] args) {
        int[] arr =  {1,2,3,4,5,6,7,8,9,10}; // Initializing an array with 10 elements
        System.out.println("single dimensional array: "+arr[0]); // Accessing the first element of the array
        System.out.println(); 

        
        int[] arr1= new int[4];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;    
        arr1[3] = 4; // Assigning values to the elements of the array
        System.out.println("single dimensional array: "+arr1); // Accessing the first element of the array
        System.out.println(); 


        int arr2[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("2 dimentional array"+arr2); // Initializing a two-dimensional array
        System.out.println(); 
        

        int arr3[][] = new int[3][3]; // Creating a 3x3 two-dimensional array
        arr3[0][0] = 1;
        arr3[0][1] = 2; 
        arr3[0][2] = 3; // Assigning values to the first row of the two-dimensional array
        arr3[1][0] = 4;
        arr3[1][1] = 5;
        arr3[1][2] = 6; // Assigning values to the second row of the two-dimensional array
        arr3[2][0] = 7;
        arr3[2][1] = 8;
        arr3[2][2] = 9; // Assigning values to the third row of the two-dimensional array
        System.out.println(arr3[0][0]+" "+arr3[0][1]+" "+arr3[0][2]); // Printing the first row of the two-dimensional array
        System.out.println(arr3[1][0]+" "+arr3[1][1]+" "+arr3[1][2]); // Printing the second row of the two-dimensional array   
        System.out.println(arr3[2][0]+" "+arr3[2][1]+" "+arr3[2][2]); // Printing the third row of the two-dimensional array
        System.out.println();


        int arr4[][] = new int[3][3];
        for(int i=0; i<3; i++)
        { // Looping through the rows of the two-dimensional array
            for(int j=0; j<3; j++)
            { // Looping through the columns of the two-dimensional array
                arr4[i][j] = i + j; // Assigning values to the elements of the two-dimensional array
                System.out.print(arr4[i][j] + " "); // Printing the elements of the two-dimensional array
            }
            System.out.println(); // Printing a new line after each row
        }
        System.out.println("arr4"); 
        System.out.println(); 


        int arr5[][] = new int[3][3];
        for(int i=0; i<3; i++)
        { // Looping through the rows of the two-dimensional array
            for(int j=0; j<3; j++)
            { // Looping through the columns of the two-dimensional array
                arr5[i][j] = (int)(Math.random() * 10);
            }
        }
        for(int i=0; i<3; i++)
        { // Looping through the rows of the two-dimensional array
            for(int j=0; j<3; j++)
            { // Looping through the columns of the two-dimensional array
                System.out.print(arr5[i][j] + " "); // Printing the elements of the two-dimensional array
            }
            System.out.println(); // Printing a new line after each row
        }
        System.out.println("arr5"); 
        System.out.println(); 
        for(int n[]: arr5)
        {
            for(int m : n)
            {
                System.out.print(m + " "); // Printing the elements of the two-dimensional array using enhanced for loop
            }
            System.out.println();
        } 
        System.out.println("arr5 using enhanced for loop");
        System.out.println();
    }
}

