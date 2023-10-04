package sdet.javafoundationexercise;

public class FairCandy {
	
	 public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
	        int i=0,j=0,aliceInitialSum=0,bobIntialsum=0,aliceCurrentSum=0,bobCurrentsum=0;
	        
	        for(int k=0;i<aliceSizes.length;k++) {
	        	aliceInitialSum=aliceInitialSum+aliceSizes[k];
	        }
	        
	        for(int k=0;i<bobSizes.length;k++) {
	        	bobIntialsum=bobIntialsum+bobSizes[k];
	        }
	        
	        while(i<aliceSizes.length){
	        	j=0;
	        	while(j<bobSizes.length) {
	        		aliceCurrentSum=aliceInitialSum-aliceSizes[i]+bobSizes[j];
	        		bobCurrentsum=bobIntialsum+aliceSizes[i]-bobSizes[j];
	        		if(aliceCurrentSum==bobCurrentsum) {
	        			return new int[] {aliceSizes[i],bobSizes[j]};
	        		}
	        		
	        		j++;
	        	}
	        	i++;
	        	
	        }
	        
	        return new int[] {0,0};
	    }

}
