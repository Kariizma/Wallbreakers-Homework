class Solution {
    public void solve(char[][] board)
    {

        if(board.length == 0 || board[0].length == 0) return;
        for(int i = 0; i < board.length; i++)
        {
            if(board[i][0] == 'O') boundaryDFS(board,i,0);
            if(board[i][board[0].length-1] == 'O')boundaryDFS(board,i,board[0].length-1);
        }

        for(int j = 0; j < board[0].length; j++)
        {
            if(board[0][j] == 'O')
                boundaryDFS(board,0,j);
            if(board[board.length-1][j] == 'O')
                boundaryDFS(board,board.length-1,j);
        }


        for(int k = 0; k < board.length; k++)
        {
            for(int l = 0; l < board[0].length; l++)
            {
                if(board[k][l] == 'O')
                    board[k][l] = 'X';
                else if(board[k][l] == '*')
                    board[k][l] = 'O';
            }
        }
    }


    private void boundaryDFS(char[][] board, int i, int j)
    {
        //out of bounds checks
        if(i >= board.length || i < 0 || j > board[0].length || j < 0)
            return;
        if(board[i][j] == 'O')
            board[i][j] = '*';
        //up
        if(i > 0 && board[i-1][j] == 'O')
            boundaryDFS(board,i-1,j);
        //down
        if(i < board.length-1 && board[i+1][j] == 'O')
            boundaryDFS(board,i+1,j);
        //left
        if(j > 0 && board[i][j-1] == 'O')
            boundaryDFS(board,i,j-1);
        //right
        if(j < board[0].length-1 && board[i][j+1] == 'O')
            boundaryDFS(board,i,j+1);
    }
}


/*
  x o x x
  o o o x
  x o x x

*/
