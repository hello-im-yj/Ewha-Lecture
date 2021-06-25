windows10 /Visual Studio 2019 환경에서 작성됨.

[hw6_1.cpp]

Description : build_max_heap 함수를 구현하여 heap을 sorting하라.
code explanation : heap에는 랜덤하게 key가 들어간다.

예제 출력 : input_size = 10
Input data                                                                                                              
2468                                                                                                                    
513                                                                                                                     
1743                                                                                                                    
1587                                                                                                                    
1706                                                                                                                    
2034                                                                                                                    
9877                                                                                                                    
8697                                                                                                                    
1690                                                                                                                    
5708                                                                                                                                                                                                                                            
Sorted data                                                                                                             
513                                                                                                                     
1587                                                                                                                    
1690                                                                                                                    
1706                                                                                                                    
1743                                                                                                                    
2034                                                                                                                    
2468                                                                                                                    
5708                                                                                                                    
8697                                                                                                                    
9877                                                                                                                                                                                                                                            
Sorting result is correct.  


[hw6_2.cpp]
Description : Huffman code의 traversal, encoding, decoding 함수를 구현하라.
code explanation : 주어진 input에 대해 Huffman code를 이용해서 구현

예제 출력
* Huffman codeword                                                                                                      
a: 0                                                                                                                    
b: 101                                                                                                                  
c: 100                                                                                                                  
d: 111                                                                                                                  
e: 1101                                                                                                                 
f: 1100                                                                                                                                                                                                                                         
* input chars: abacdebaf                                                                                                                                                                                                                        
* Huffman encoding                                                                                                      
total length of bits stream: 23                                                                                         
bits stream: 01010100111110110101100                                                                                                                                                                                                            
* Huffman decoding                                                                                                      
total number of decoded chars: 9                                                                                        
decoded chars: abacdebaf 

