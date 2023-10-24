class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		if (s.size() <= 1) {
            return s;
        }

        int temp = s.pop();
        sort(s);
        insert(s, temp);

        return s;
    }

    private static void insert(Stack<Integer> s, int temp) {
        if (s.isEmpty() || s.peek() <= temp) {
            s.push(temp);
            return;
        }

        int val = s.pop();
        insert(s, temp);
        s.push(val);
    
	}
   public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(1);
        st.push(0);
        st.push(5);

        sort(st);

        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
}
