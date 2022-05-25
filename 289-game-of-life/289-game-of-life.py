class Solution:
    def gameOfLife(self, board: List[List[int]]) -> None:
        """
        Do not return anything, modify board in-place instead.
        """
        m,n=len(board),len(board[0])
        for i in range(m):
            for j in range(n):
                live=board[i][j]
                if live==1 or live==0:
                    count=sum(abs(board[x][y])==1 for x in (i-1,i,i+1) if x>=0 and x<m for y in (j-1,j,j+1) if y>=0 and y<n) - live
                    if live==1:
                        if count<2 or count>3:
                            board[i][j]=-1
                    elif count==3:
                        board[i][j]=2
        for i in range(m):
            for j in range(n):
                if board[i][j]==2:
                    board[i][j]=1
                elif board[i][j]==-1:
                    board[i][j]=0
                
        