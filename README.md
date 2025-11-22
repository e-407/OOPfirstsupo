How to run solutions + explanation of solutions:

Q1.4: run StudentReportGenerator.java

Q1.5a: run MathUtil.java

Q1.6: run TailRecursionTest.java. The code attempts to increment a value 1,000,000 times tail-recursively. If the environment performs tail-recursion, the code should run without issue. If there is a stack overflow error, then the environment must not perform tail-recursion optimisations.

Q1.7: run LowestCommonFinder.java. The lowestCommon method first computes a bitwise AND on the two inputs. Any common bits will therefore correspond to a 1 in commonbits. The code then iterates through commonbits, using modular arithmetic to check whether the current bit is a 1, and otherwise dividing by 2 to shift to the next bit.

Q1.8: run MatrixFunctions.java. The transpose function goes through the upper right half of the matrix (excluding the diagonal) and individually transposes elements to ensure O(1) space.

Q2.3a: run Vector2D.java. Methods mutate the object (where possible) instead of returning new vectors.

Q2.4a: run OOPLinkedList.java. As the question mentioned FoCS, I decided to implement this the way OCaml implements lists, also defining recursive functions as OCaml would.

Q2.5: code in ReportModel.java, ReportView.java, ReportController.java. Code has been refactored to align with the MVC model. I've only added the methods from the question.

Q2.6a: code in FinalStudentRecord.java

Q2.6b: code in StudentRecord.java

Q2.7b: run SearchSet.java (code also in BinaryTreeNode.java). Both the insert and contains methods recursively traverse the tree.

Q2.7c: run FunctionalArray.java. The indexing follows the structure seen in the FoCS course. The recursive methods select which direction to traverse the tree, and the index is updated so the branch node becomes the root in each recursive call.