package in.ineuron.exmpl;

import java.util.Arrays;
import java.util.List;


public int[] FindOrginalFromDoubleArr(int[] changed)  
{  
List<Integer> queue = new java.util.LinkedList();  
Arrays.sort(changed);  
for(int num:  changed)  
{  
if(!queue.isEmpty() && num == queue.peek())  
{  
queue.poll();  
}  
else  
{  
Queue.offer(num*2);  
result.add(num);  
}  
}  
return !queue.isEmpty() ? new int[] {}: result.stream().mapToInt(i -> i).toArray();  
}  
