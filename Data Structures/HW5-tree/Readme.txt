windows10 /Visual Studio 2019 환경에서 작성됨.

[hw5_2.cpp]
inorder traversal에서 노드의 successor를 찾는 함수 작성.
1) 탐색하는 노드의 오른쪽 서브트리가 NULL이 아닌 경우 : 
   해당 서브트리의 가장 왼쪽의 노드를 리턴
2) 탐색하는 노드의 오른쪽 서브트리가 NULL인 경우 : 
   해당 서브트리의 부모 노드를 고려하여야한다. R까지 탐색을 마친 경우이므로 부모 노드로 이동하여 R인 경우 부모 노드로 이동하고 그 외에는 부모 노드가 succesor가 된다.

<실행결과>
A
C
B
G
D
F
E	
____________________

[hw5_3.cpp]
inorder traversal에서 노드의 predecessor를 찾는 함수 작성.
1) 탐색하는 노드의 왼쪽 서브트리가 NULL이 아닌 경우 : 
   해당 서브트리의 가장 오른쪽의 노드를 리턴
2) 탐색하는 노드의 왼쪽 서브트리가 NULL인 경우 : 
   해당 서브트리의 부모 노드를 고려하여야한다. L까지 탐색을 마친 경우이므로 부모 노드로 이동하여 L인 경우 부모노드로 이동하고 그 외에는 부모 노드가 succesor가 된다.

<실행결과>
E
F
D
G
B
C
A
____________________

[hw5_4.cpp]
강의자료 page 60 and 61의 case 3( inorder traversal인 binary tree에서 deletion 함수 실행)에서 right subtree의 successor를 활용한 코드를 left tree의 predecessor를 활용한 코드로 바꾸어 구현.

- #include "stdafx.h" 코드는 제가 사용한 Visual Studio 2019 IDE에서는 에러가 발생하여 주석처리 하였습니다. 
- bst_insertion_deletion.cpp 파일을 바탕으로 작성되었으며, delete_node의 함수의 case 3 부분을 수정하였습니다.


<실행결과>는 bst_insertion_deletion.cpp과 동일합니다. 
key = 18
Binary tree
3       7       10      12      18      22      24      26      30      35      68      99
Binary tree
3       7       10      12      22      24      26      30      35      68      99

key = 35
Binary tree
3       7       10      12      18      22      24      26      30      35      68      99
Binary tree
3       7       10      12      18      22      24      26      30      68      99

key = 7
Binary tree
3       7       10      12      18      22      24      26      30      35      68      99
Binary tree
3       10      12      18      22      24      26      30      35      68      99



