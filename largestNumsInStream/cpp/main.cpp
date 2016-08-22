// PROBLEM
// Print the largest N numbers in an unbounded stream of numbers.

// Example run:
//    ./executable N ../input

#include <stdlib.h>
#include <fstream>
#include <iostream>
#include <vector>
using namespace std;

int main ( int argc, char *argv[] ) {

  if (argc != 3) {
    cout << "Must supply 2 command line arguments. The first specifies the largest N numbers to return in the stream. The second specifies the input file to be read." << endl;
    exit (EXIT_FAILURE);
  }

  int N = atoi(argv[1]);
  string inputFile = string(argv[2]);

  vector<int> numsToKeep;
  int lineNumber = 0;
  int num;
  string line;
  ifstream myfile (inputFile);
  bool needToSort;

  if (myfile.is_open()) {
    while (getline (myfile,line)) {
      lineNumber++;
      needToSort = false;
      num = stoi(line);

      if (lineNumber <= N) {
        numsToKeep.push_back(num);
        needToSort = true;
      }

      else if (num > numsToKeep[0]) {
        numsToKeep[0] = num;
        needToSort = true;
      }

      if (needToSort) {
        std::sort(numsToKeep.begin(), numsToKeep.end());
      }
    }
    myfile.close();
  }

  else {
    cout << "Unable to open file."; 
    exit (EXIT_FAILURE);
  }

  for (auto i : numsToKeep) {
    cout << i << endl;
  }

  return 0;
}
