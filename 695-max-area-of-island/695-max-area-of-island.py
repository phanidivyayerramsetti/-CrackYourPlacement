class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
         if not grid:
            return 0
         island=0
         row,col=len(grid),len(grid[0])
         visited=set()
         max_area=0
         
         def  bfs(r,c,max_area):
            
            area=1
            q=deque()
            q.append((r,c))
            while len(q)!=0:
                r,c=q.pop()
                if 0<=r-1<row and grid[r-1][c]==1 and (r-1,c) not in visited:
                    visited.add((r-1,c))
                    q.append((r-1,c))
                    area+=1
                if 0<=r+1<row and grid[r+1][c]==1 and (r+1,c) not in visited:
                    visited.add((r+1,c))
                    q.append((r+1,c))
                    area+=1
                if 0<=c+1<col and grid[r][c+1]==1 and (r,c+1) not in visited:
                    visited.add((r,c+1))
                    q.append((r,c+1))
                    area+=1
                    
                if 0<=c-1<col and grid[r][c-1]==1 and (r,c-1) not in visited:
                        visited.add((r,c-1))
                        q.append((r,c-1))
                        area+=1
            return area  
         for r in range(row):
            for c in range(col):
                if grid[r][c]==1 and (r,c) not in visited:
                    visited.add((r,c))
                   
                    max_area=max(bfs(r,c,max_area),max_area)
             
         return max_area
