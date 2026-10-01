#f = x19, i = x20, j = x21

.data

.text
.globl main

main:
	li x20, 6
	li x21, 10
	bgt x20, x21, else
	mv x19, x20
	j exit
else:
	mv x19, x21
exit:
	li a7, 10
	ecall