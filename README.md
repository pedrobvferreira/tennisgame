# tennisgame

The program should take two arguments on the command line:
respectively the name of an input file and the name of an output
file.

Each line of the input file is a description of a tennis match
between two players named 'A' and 'B', and comprises a sequence
of 'A's and 'B's which indicates the winner of each point in the
match in the order that they are played.

For each line in the input, the program should write a line to
the output in the format:

[completed set scores] [score in current set] [score in current game]

For example: 0-2 0-15
                 ^^^^ score in current game
             ^^^ score in current set

Each score is shown in the form 'n-m' where 'n' is the current
server's score and 'm' is the current receiver's score. The server
changes at the end of each game, and player A serves first.

The score in points in the current game is omitted if it is 0-0.

An advantage score is shown 40-A or A-40.

There is no tiebreak in any set.

An example input file, and the corresponding output file, is
included. The submitted program is expected to produce a
character-for-character copy of this output file from this input
file, so careful attention must be paid to whitespace characters.

The input file can be assumed to only comprise lines of sequences
of 'A's and 'B's which form matches which have not been won by
either player. 

The rules of tennis scoring may be found online at [1]. For this
exercise, the match is won by the best of three sets and it's represented by 
A Won or B Won.

[1] http://en.wikipedia.org/wiki/Tennis_score
