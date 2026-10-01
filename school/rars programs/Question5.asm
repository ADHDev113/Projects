.data


.text
.globl main

main:
#ld - load a double word (64-bits)
#lw - load a word (32-bits)
#li - load an immediate value

	#Loading immediate vallues
	li t0, 10
	li t1, 5
	
	##performing arithmetic operations
	add t2, t0, t1
	sub t3, t0, t1
	mul t4, t0, t1
	div t5, t0, t1
	
	#exiting
	li a7, 10
	ecall