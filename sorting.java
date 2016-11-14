public class sorting
{
public static void BubbleSort( int [ ] num )
{
     int j;
     boolean sort = true;   // set flag to true to begin first pass
     int temp;   //holding variable

     while ( sort )
     {
            sort= false;    //set flag to false awaiting a possible swap
            for( j=0;  j < num.length -1;  j++ )
            {
                   if ( num[ j ] < num[j+1] )   // change to > for ascending sort
                   {
                           temp = num[ j ];                //swap elements
                           num[ j ] = num[ j+1 ];
                           num[ j+1 ] = temp;
                          sort = true;              //shows a swap occurred  
                  } 
            } 
      } 
} 
}