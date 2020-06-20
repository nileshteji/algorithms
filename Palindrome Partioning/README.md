Palindrome Partitioning
This Question took me one whole day to understand
So In this we check all the substrings starting from the start index till we reach the end of the string
So What is exactly happening in the backtracking 
So we add the palindromic string in the deque or any collection which you are using.and then we go to the next character for the palindromic string and traverse the same 
So when the call stack is getting returned then the elements in the deque are also getting deleted so that they can be used for the next iteration so on backtracking we delete the element which we added in the stack that is the palindromic string itself 
