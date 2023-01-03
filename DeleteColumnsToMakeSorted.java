class DeleteColumnsToMakeSorted {
    public int minDeletionSize(String[] strs) {
        int columns = strs[0].length(); //maximum
        int col=0;  
        int delcol=0; 
        for(col=0; col<columns; col++){
            for(int i=0; i<strs.length-1;i++){
                if(strs[i].charAt(col)>strs[i+1].charAt(col)){
                    delcol++; 
                    break; 
                }
            }
        }
        return delcol; 
                
    }
}
