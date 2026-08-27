class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[]rows= new HashSet[9];
        HashSet<Character>[]cols= new HashSet[9];
        HashSet<Character>[]blocks= new HashSet[9];
          for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            blocks[i] = new HashSet<>();}
        for(int i=0;i<9;i++)
    {
        for(int j=0;j<9;j++)
        {
            char c=board[i][j];
            if(c=='.')
            continue;
            int t=(i/3)*3 + (j/3);
            if(!rows[i].add(c)||!cols[j].add(c)||!blocks[t].add(c))
            return false;
        }
    }
    return true;
    }
}