#f = x19, g = x20, h = x21, i = x22, j = x23
# if (i==j) f = g + h, else f = g - h

.data

.text
.globl main

main:
	#loading some sample values
	li x20, 10
	li x21, 5
	li x22, 6
	li x23, 6
	
	#condition check and branching if necessary
	bne x22, x23, else
	add x19, x20, x21
	j exit
else:
	sub x19, x20, x21
	
exit:
	li a7, 10
	ecall