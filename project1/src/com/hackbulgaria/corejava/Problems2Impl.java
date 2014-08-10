package com.hackbulgaria.corejava;

import java.util.Arrays;

public class Problems2Impl implements Problems2 {

    @Override
    public boolean isOdd(int number) {
        if(number%2==0)
        {
            return false;
        }
        return true;
    }

    @Override
    public boolean isPrime(int number) {
        // TODO Auto-generated method stub
        
        
            for(int i=2; i<(number/2)+1; i++)
            {
                if(number%i==0){
                    return false;
                }
            }
            return true;
    }

    @Override
    public int min(int... array) {
        // TODO Auto-generated method stub
        int minimum=0;
        minimum=array[0];
        for(int i=1; i<array.length; i++)
        {
            
            if(minimum>array[i])
            {
                minimum=array[i];
            }
            
        }
        return minimum;
    }

    @Override
    public int kthMin(int k, int[] array) {
        // TODO Auto-generated method stub
        for(int i=0; i<array.length-1; i++)
        {
           
            for(int j=i+1; j<array.length; j++)
            {
                if(array[i]>array[j])
                {
                   int max=array[i];
                    array[i]=array[j];
                    array[j]=max;
                }
            }
                 
        }
        return array[k-1];
    }

    @Override
    public float getAverage(int[] array) {
        float avr=0;
        for(int i=0; i<array.length; i++)
        {
            avr+=array[i];
        }
        return avr/(array.length);
    }

    @Override
    public long getSmallestMultiple(int upperBound) {
        // TODO Auto-generated method stub

        long mul=1;
        if(upperBound==1)
        {
            return mul;
        }
        int n=upperBound;
        int m=upperBound;
        long mult=1;
        for(int j=2; j<=m; j++)
        {
            n=j;
        for(int i=2; i<=n; i++)
        {
            if(n%i==0)
            {
                if(mult%j!=0)
                {
                    mult*=i;
                }
                n/=i;
                i--;
               
            }
            if(n==1)
                break;
            
        }
       // mult*=mul;
        //mul=1;
        }
        return mult;
       // return mul*(getSmallestMultiple(upperBound-1));
    }

    @Override
    public long getLargestPalindrome(long N) {
        // TODO Auto-generated method stub
        
        return 0;
    }

    @Override
    public int[] histogram(short[][] image) {
        // TODO Auto-generated method stub
        
        return null;
    }

    @Override
    public long doubleFac(int n) {
        // TODO Auto-generated method stub
        long f=1;
        if(n==1 || n==0 || n<0)
            return f;
        for(int i=0; i<n; i++)
        {
            f*=i+1;
        }
        int fsec=1;
        for(int i=0; i<f; i++)
        {
            fsec*=i+1;
        }
        return fsec;
    }

    @Override
    public long kthFac(int k, int n) {
        // TODO Auto-generated method stub
        long f=1;
        if(n<=1)
        {
           // long f=1;
            return f;
        }
        if(k==1)
        {
            //long f=1;
            for(int i=1; i<n+1; i++)
            {
                f*=i;
            }
            return f;
        }
        if(k>1)
        {
          //  long f=1;
            for(int i=1; i<n+1; i++)
            {
                f=f*i;
            }
            f=f*(kthFac(k-1, n));
            return f;
        }
        return f;   
        }

    @Override
    public int getOddOccurrence(int[] array) {
        // TODO Auto-generated method stub
        int br=0;
        int result=0;
        for(int i=0; i<array.length; i++)
        {
            for(int j=0; j<array.length; j++)
                if(array[i]==array[j])
                    br++;
            if(br%2!=0)
            {
                result= array[i];
            }
                br=0;
        }
        //return 0;
       return result;
    }

    @Override
    public long pow(int a, int b) {
        // TODO Auto-generated method stub
        long p=1;
        if(b==0)
            p=1;
        if(b==1)
            p=a;
        if(b>1)
            p= a*(pow(a, b-1));
        if(b==-1)
            p= 1/a;
        if(b<-1)
        {
       p=(1/a)*pow(a, b+1);
        }
        return p;
    }

    @Override
    public long maximalScalarSum(int[] a, int[] b) {
        // TODO Auto-generated method stub
        long sum=0;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0; i<a.length; i++)
            sum+=a[i]*b[i];
        return sum;
    }

    @Override
    public int maxSpan(int[] array) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean canBalance(int[] array) {
        // TODO Auto-generated method stub
        int sum1=0;
        int sum2=0;
        int j=array.length-1;
        int n=array.length;
        for(int i=0; i<n; i++)
        {
            sum1+=array[i];
          if(j==i)
          break;
            while(sum1>sum2)
            {
                sum2+=array[j];
                j--;
              //  n--;
            }
        }
        return sum2==sum1;
    }

    @Override
    public int[][] rescale(int[][] original, int newWidth, int newHeight) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String reverseMe(String argument) {
        // TODO Auto-generated method stub
//        String a;
//        for(int i=0; i<argument.length(); i++)
//        {
//        for(int j=argument.length() -1; j>0; j--)
//        {  
//            a[i]=argument[j];
//        }}
        return null;
    }

    @Override
    public String copyEveryChar(String input, int k) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String reverseEveryWord(String arg) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isPalindrome(String argument) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isPalindrome(int number) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int getPalindromeLength(String input) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int countOcurrences(String needle, String haystack) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String decodeURL(String input) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int sumOfNumbers(String input) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean areAnagrams(String A, String B) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasAnagramOf(String string, String string2) {
        // TODO Auto-generated method stub
        return false;
    }

}
