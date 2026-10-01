.data

.text
.globl main

main:
	li a0, 1
	li a1, 2
	li a2, 3
	
	jal ra, function1
	
	li a7, 1
	ecall
	
	li a7, 10
	ecall
	
function1:
	add t0, a0, a1
	mul t0, t0, a2
	mv a0, t0
	jalr ra, 0(ra)