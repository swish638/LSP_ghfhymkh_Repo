package org.howard.edu.lsp.assignment2;

/**
*  Name: Chase Adams IV
*/

//>>>>>>> branch 'main' of https://github.com/swish638/LSP_Repo_kfmeknt5.git

//wordCounter 

import java.io.File;
import java.io.FileNotFoundException;
//	import java.util.ArrayList;				// did not use
//	import java.util.List;					// did not use
import java.util.Scanner;
import java.util.HashMap;


public class assignment2 {          
		public static void main(String[] args) {

			////String filePath = "src/org/howard/edu/lsp/assignment2/words.txt";    	//// for Professor to test using a path 
			String filePath = "src/org/howard/edu/lsp/assignment2/TextTest.txt";	 	//	using relative filePath for my testing file in the folder

			HashMap<String, Integer> tokenCounts = new HashMap<>();

			try {
				//scanner reads input
				//list of delimeters

				//Professor's test filePath
				////Scanner scanner = new Scanner(new File(filePath)).useDelimiter("[\\?,.:;\"'`\\!\\(\\)\t 0 1 2 3 4 5 6 7 8 9 \n\s- ]");  

				//filePath to read from my TextTest.txt
				Scanner scanner = new Scanner(new File(filePath)).useDelimiter("[\\?,.:;\"\'`!()\t 0 1 2 3 4 5 6 7 8 9 \n\\s+\r - /]");
				//Went through each of the delimiters to see if they needed an escape sequence. 
				//Added escape sequence for whitespace ("\\s+") and did not need one for exclamation mark
				System.out.println("Printing tokens to see what is being counted");
				
				while (scanner.hasNext()) {                                       	// Reading the file word by word (token by token)
					String token = scanner.next().toLowerCase();                    // Convert to lowercase for case-insensitive counting
					
					System.out.println(token);                                      // print tokens to see what is being counted

					if (token.length() >= 4) {                                      // exclude/check if token has 4 or more chars 
					tokenCounts.put(token, tokenCounts.getOrDefault(token, 0) + 1); // Increment the count for each token
					} 
				}


					scanner.close();
			} catch (FileNotFoundException e) {                                  	// catch FileNotFoundExceptions 
				e.printStackTrace();
			}
			System.out.println("Printing the token counts below");
			// Print the token counts
			for (String token : tokenCounts.keySet()) {
				System.out.println(token + ": " + tokenCounts.get(token));
			}	
		}
}	

/* the text I used to test the prgram 
fileName = "TextTest.txt";

This assignment gives you some experience with, and insight into, how some of the ideas covered in this course apply in more “real-world” settings. In particular, this exercise gives you a problem to solve, but leaves you to use your own judgement about the algorithms or data structures to use - much as a professional software developer relies on their own judgement.

While the amount of code you need to write for this exercise isn’t large, you do have to decide where you can use existing classes, where you need to adapt those classes to the particular problem at hand, and where you have to write code from scratch - again, very much the decisions a modern software developer must make in planning a project.


numbers: 1 2 3 4 5 6 7 8 9 10


Work plan:
In this assignment, you will need to design and code a program that reads a text file, 
- Write a subprogram to read text file

and counts the number of times each word that it contains appears. 
- Write program that tells me what appears, 
- count what has appeared/what is appearing

For example, if the file contained the first line of this paragraph (“Design and code a program that reads a text file, and counts the number of times each word that it contains appears 100”), the program’s output might look something like this:

- Read the words and count the words that appears in the sentence 
(just the words, though …)

- Word has only letters, look for spaces between characters

- In each string, look for when there’s space in a string

the program’s output might look something like this:



*/


/*
//// 	When I ran assignmnent2.java with TextTest.txt, 
////	the results I received in the Console looked like this:




Printing tokens to see what is being counted


this
assignment
gives
you
some
experience
with

and
insight
into

how
some
of
the
ideas
covered
in
this
course
apply
in
more
“real-world”
settings

in
particular

this
exercise
gives
you
a
problem
to
solve

but
leaves
you
to
use
your
own
judgement
about
the
algorithms
or
data
structures
to
use
-
much
as
a
professional
software
developer
relies
on
their
own
judgement




while
the
amount
of
code
you
need
to
write
for
this
exercise
isn’t
large

you
do
have
to
decide
where
you
can
use
existing
classes

where
you
need
to
adapt
those
classes
to
the
particular
problem
at
hand

and
where
you
have
to
write
code
from
scratch
-
again

very
much
the
decisions
a
modern
software
developer
must
make
in
planning
a
project






numbers



























work
plan


in
this
assignment

you
will
need
to
design
and
code
a
program
that
reads
a
text
file



-
write
a
subprogram
to
read
text
file



and
counts
the
number
of
times
each
word
that
it
contains
appears



-
write
program
that
tells
me
what
appears



-
count
what
has
appeared
what
is
appearing



for
example

if
the
file
contained
the
first
line
of
this
paragraph

“design
and
code
a
program
that
reads
a
text
file

and
counts
the
number
of
times
each
word
that
it
contains
appears



”


the
program’s
output
might
look
something
like
this




-
read
the
words
and
count
the
words
that
appears
in
the
sentence



just
the
words

though
…




-
word
has
only
letters

look
for
spaces
between
characters



-
in
each
string

look
for
when
there’s
space
in
a
string



the
program’s
output
might
look
something
like
this




Printing the token counts below
very: 1
software: 2
counts: 2
about: 1
decide: 1
your: 1
program: 3
when: 1
professional: 1
output: 2
number: 2
problem: 2
appeared: 1
text: 3
write: 4
plan: 1
letters: 1
between: 1
sentence: 1
large: 1
work: 1
scratch: 1
each: 3
something: 2
insight: 1
planning: 1
contains: 2
must: 1
word: 3
much: 2
judgement: 2
algorithms: 1
paragraph: 1
subprogram: 1
exercise: 2
there’s: 1
example: 1
into: 1
file: 3
modern: 1
have: 2
course: 1
where: 3
decisions: 1
gives: 2
hand: 1
though: 1
more: 1
structures: 1
words: 3
tells: 1
first: 1
data: 1
numbers: 1
project: 1
experience: 1
while: 1
“real-world”: 1
space: 1
that: 6
leaves: 1
only: 1
from: 1
appearing
: 1
those: 1
settings: 1
read: 2
need: 3
like: 2
might: 2
adapt: 1
this: 8
count: 2
ideas: 1
particular: 2
look: 4
covered: 1
solve: 1
spaces: 1
program’s: 2
some: 2
code: 4
string: 1
line: 1
classes: 2
their: 1
appears: 4
string
: 1
times: 2
relies: 1
design: 1
“design: 1
characters
: 1
make: 1
just: 1
file
: 1
amount: 1
apply: 1
will: 1
assignment: 2
again: 1
reads: 2
with: 1
existing: 1
contained: 1
what: 3
developer: 2
isn’t: 1

*/






