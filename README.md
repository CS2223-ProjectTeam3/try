# try
Compare horspool's algorithm to a creative method with a similar idea that uses hashing.
Horspool's algorithm that returns the number of times the word appears in the text or the Hashing algorithm
that does the same exact thing

# Uses:
Say you are a spy and the amount of times a certain word appears in the coded message determines which one of the coded
locations you have to travel to in order to receive new intel.
E.g. 
word appears 0 times in the message -> go to address A
word appears 1 time -> go to address B
word ppears 2 times -> go to address C

You have to pass text (coded email – a mix of dots and letters. e.g. Xda.wgweDww.qUFwh.Rwej.awd.weg.qwygR.WYb2e.awfihk.)
and retrieve the number of times the sequence maintains

The gestapo are looking for you in your house. You have to retrieve the last location as fast as possible. Which option do
you go for: retrieve using horsepool's, or retrieve using a hashfunction

# How it works:
1. horspool's- 
works just like horspool's but utilizes a counter to count the number of times the word appears in the text.
once the word is reached does a "+1" on the counter and forces the algorithm to move further in the line of strings.

2. Hash (same code as elephant's child)- 
use hashFunction on the keyword , retrieve hashValue x.
hashSearch(int x)
  hashes each of the words but prior to storing checks if hashValue of the word = x;
    yes-> store in the table + store the string in a different array (keyArray)
    no-> move onto the next word
    
Then, you gotta iterate through the keyArray and look for how many times that word turns up there.

# Idea:
Hashing may be faster because you only use string check on values that you know for a fact have the highest chance of being
the string we are looking for.
