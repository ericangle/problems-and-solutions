# PROBLEM
# Print the largest N numbers in an unbounded stream of numbers.

# Example run:
#    python largestNumsInStream.py N ../input

import sys

cmdLineArgs = (sys.argv)[1:]

if len(cmdLineArgs) != 2:
  sys.exit('Must supply 2 command line arguments. The first specifies the largest N numbers to return in the stream. The second specifies the input file to be read.')

N           = int(cmdLineArgs[0])
inputFile   = cmdLineArgs[1]
numsToKeep  = list()
f           = open(inputFile, 'r')
lineNumber  = 0

for line in f:
  lineNumber = lineNumber + 1

  num = int(line.splitlines()[0])
  needToSort = False

  if lineNumber <= N:
    numsToKeep.append(num)
    needToSort = True

  elif num > numsToKeep[0]:
    numsToKeep[0] = num
    needToSort = True

  if needToSort:
    numsToKeep.sort()

print numsToKeep 
