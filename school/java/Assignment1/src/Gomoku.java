import java.util.Scanner;

public class Gomoku
{
    public static void main(String[] args)
    {

        char[][] board = new char[19][19];
        boolean play = true;
        int playerTurn = 1;
        int row;
        int column;

        Scanner input = new Scanner(System.in);

        fillBoard(board);
        displayBoard(board);

        while (play)
        {
            System.out.printf("\nPlayer %d's turn!\n", playerTurn);
            System.out.print("Enter row: ");
            row = input.nextInt();
            System.out.print("Enter column: ");
            column = input.nextInt();

            if (isValidMove(board, row, column))
            {
                if (playerTurn == 1)
                {
                    board[row][column] = '●';
                } else
                {
                    board[row][column] = '○';
                }
                System.out.println();
                displayBoard(board);
            }
            else
            {
                System.out.println("\nInvalid move! Try again!");
                continue;
            }

            if (isBoardFull(board))
            {
                System.out.println("Board is full! Nobody wins!");
                System.out.print("Play again? y/n: ");
                if (input.next().charAt(0) == 'y')
                {
                    System.out.println();
                    fillBoard(board);
                    displayBoard(board);
                }
                else
                {
                    play = false;
                }
            }
            else if (hasPlayerWon(board, playerTurn))
            {
                System.out.printf("\nPlayer %d Wins!\n", playerTurn);
                System.out.print("Play again? y/n: ");
                if (input.next().charAt(0) == 'y')
                {
                    System.out.println();
                    fillBoard(board);
                    displayBoard(board);
                }
                else
                {
                    play = false;
                }
            }
            else
            {
                if (playerTurn == 1)
                {
                    playerTurn++;
                }
                else
                {
                    playerTurn--;
                }
            }
        }

    }

    public static void fillBoard(char[][] board)
    {
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[i].length; j++)
            {
                board[i][j] = '.';
            }
        }
    }

    public static void displayBoard(char[][] board)
    {

        System.out.print("   ");
        for (int i = 0; i < 19; i++)
        {
            System.out.printf("%3d", i);
        }
        System.out.println();

        for (int i = 0; i < 19; i++)
        {
            System.out.printf("%3d", i);
            for (int j = 0; j < 19; j++)
            {
                System.out.printf("  %c", board[i][j]);
            }
            System.out.println();
        }
    }


    public static boolean isValidMove(char[][] board, int row, int column)
    {
        if(row > 19 || column > 19)
        {
            return false;
        }
        if(board[row][column] == '.')
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean isBoardFull(char[][] board)
    {
        boolean isFull = true;
        for (int i = 0; i < 19; i++)
        {
            for (int j = 0; j < 19; j++)
            {
                if (board[i][j] == '.')
                {
                    isFull = false;
                    break;
                }
            }
        }
        return isFull;
    }

    public static boolean hasPlayerWon (char[][] board, int player)
    {
        if (isHorizontalWin(board, player) || isVerticalWin(board, player) || isDiagonalWin(board, player))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean isHorizontalWin(char[][] board, int player)
    {

        char charToCheck;
        boolean isWin;

        if (player == 1)
        {
            charToCheck = '●';
        }
        else
        {
            charToCheck = '○';
        }

        for (int i = 0; i < 19; i++)
        {
            for (int j = 0; j < 19; j++)
            {
                if(board[i][j] == charToCheck)
                {
                    isWin = true;

                    if(j < 15)
                    {
                        for (int k = j + 1; k < j + 5; k++)
                        {
                            if (board[i][k] != charToCheck)
                            {
                                isWin = false;
                                break;
                            }
                        }
                    }
                    else
                    {
                        isWin = false;
                    }

                    if(isWin)
                    {
                        return true;
                    }

                }
            }
        }

        return false;
    }

    public static boolean isVerticalWin(char[][] board, int player)
    {

        char charToCheck;
        boolean isWin;

        if (player == 1)
        {
            charToCheck = '●';
        }
        else
        {
            charToCheck = '○';
        }

        for (int i = 0; i < 19; i++)
        {
            for (int j = 0; j < 19; j++)
            {
                if(board[i][j] == charToCheck)
                {
                    isWin = true;

                    if(i < 15)
                    {
                        for (int k = i + 1; k < i + 5; k++)
                        {
                            if (board[k][j] != charToCheck)
                            {
                                isWin = false;
                                break;
                            }
                        }
                    }
                    else
                    {
                        isWin = false;
                    }

                    if(isWin)
                    {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static boolean isDiagonalWin(char[][] board, int player)
    {

        char charToCheck;
        boolean isWinRight;
        boolean isWinLeft;

        if (player == 1)
        {
            charToCheck = '●';
        }
        else
        {
            charToCheck = '○';
        }

        for (int i = 0; i < 19; i++)
        {
            for (int j = 0; j < 19; j++)
            {
                if(board[i][j] == charToCheck)
                {
                    isWinRight = true;
                    isWinLeft = true;

                    if (i < 15 && j < 15)
                    {
                        for (int k = i + 1; k < i + 5; k++)
                        {
                            if (board[k][j + k - i] != charToCheck)
                            {
                                isWinRight = false;
                                break;
                            }
                        }
                    }
                    else
                    {
                        isWinRight = false;
                    }

                    if (i > 3 && j > 3)
                    {
                        for (int k = i + 1; k < i + 5; k++)
                        {
                            if (board[k][j - (k - i)] != charToCheck)
                            {
                                isWinLeft = false;
                                break;
                            }
                        }
                    }
                    else
                    {
                        isWinLeft = false;
                    }

                    if(isWinRight || isWinLeft)
                    {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
