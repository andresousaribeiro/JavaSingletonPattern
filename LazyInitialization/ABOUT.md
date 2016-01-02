 ## About Lazy Initialization
 
This implementation works fine on single threaded environment but when it comes to multithreaded systems, 
it can cause issues if multiple threads are inside the if loop at the same time.