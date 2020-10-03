def selection(arr):
     n=len(arr)

     for i in range(n):
         min_pos=i
         for j in range(i+1,n):
             if arr[min_pos]>arr[j]:
                 min_pos=j

         #for swappping
         temp=arr[i]
         arr[i]=arr[min_pos]
         arr[min_pos]=temp

arr=[8,9,6,3,4]
selection(arr)
print(arr)