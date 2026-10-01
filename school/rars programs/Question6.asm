.text
.globl main

main:
	li t0, 5
	#5*8
	slli t1, t0, 3
	
	li t2, 7
	li t3, 2
	sll t4, t2, t3
	
	li t5, 20
	srli t6, t5, 2
	
	li t2, 32
	srli t3, t2, 3
	
	li a7, 10
	ecall
