.data

.text
.globl main

main:
	#loading a and b for add function
	li a0, 3
	li a1, 2
	#I have to call the procedure
	jal ra, adding
	#access the result and print the result
	li a7, 1
	ecall
	
	li a7, 10
	ecall
	
adding:
	add a0, a0, a1
	#I have to get back to the caller
	jalr x0, 0(ra) #ret