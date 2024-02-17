class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        int k=(sizeOfStack/2)+1;
        solve(s,k);
        
    } 
    private void solve(Stack<Integer> st, int k)
    {
        if(k==1)
        {
            st.pop();
            return;
        }
        int temp=st.pop();
        solve(st,k-1);
        st.push(temp);
    }
public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        Solution solution = new Solution();
        solution.deleteMid(st, st.size());

        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
}
