.text
.globl main

main:
	#load immediate values
	li t0, 10
	li t1, 12
	
	#operations
	and t2, t0, t1
	or t3, t0, t1
	xor t4, t0, t1
	not t5, t0
	
	li a7, 10
	ecall