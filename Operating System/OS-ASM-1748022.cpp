#include <stdio.h>
#include <stdlib.h>

struct PAGE {
	int memory_location;
	int valid_bit;
};
struct PAGE page[200000];

struct MEMORY {
	int page_num;
	int reference_bit; 
	int dirty_bit; 
};

int main(int argc, char* argv[]) {

	int memory_size = atoi(argv[1]); 
	FILE* input_file = fopen("a.txt", "r");
	struct MEMORY* memory = (struct MEMORY*) malloc(memory_size * sizeof(struct MEMORY));
	int page_fault = 0, disk_write = 0, head_movement = 0;

	for (int i = 0; i < memory_size; i++) {
		memory[i].reference_bit = 0;
		memory[i].dirty_bit = 0;
	}

	for (int i = 0; i < 200000; i++) page[i].valid_bit = 0;	

	int pg, op;
	int available = memory_size; bool empty = 0;
	int clock = 0, head_location = 0;

	while (!feof(input_file)) {

		fscanf(input_file, "%d %d", &pg, &op);
		if (available > 0) available--;
		else empty = true;

		if (page[pg].valid_bit == 1) {	
			memory[page[pg].memory_location].reference_bit = 1;	
			if (op == 1) {
				memory[page[pg].memory_location].dirty_bit = 1;	
			}
		}

		else
		{
			page_fault++;	
			if (empty)	
			{
				while (memory[clock].reference_bit == 1) {
					memory[clock].reference_bit = 0;
					clock = (clock + 1) % memory_size;
				}

				page[memory[clock].page_num].valid_bit = 0;	

				if (memory[clock].dirty_bit == 1) {  
					head_movement += abs(head_location - (memory[clock].page_num / 1000));	
					head_location = (memory[clock].page_num / 1000);
					disk_write++;
				}
			}

			head_movement += abs(head_location - (pg / 1000));
			head_location = (pg / 1000);
			memory[clock].page_num = pg;
			if (op == 1) memory[clock].dirty_bit = 1;
			else memory[clock].dirty_bit = 0;
			memory[clock].reference_bit = 0;		
			page[pg].memory_location = clock;
			page[pg].valid_bit = 1;
			clock = (clock + 1) % memory_size;

		} //end of else

	} //end of while

	printf("%d\n", page_fault);	printf("%d\n", disk_write); printf("%d\n", head_movement);

} //end of main