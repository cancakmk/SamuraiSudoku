/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sudoku1;

/**
 *
 * @author asus
 */
class Samurai
{
   
    public static void main(String args[])
    {
      

	int[][] puzzle1 =
	    {{0,0,0,0,0,5,0,0,0, 0,0,0, 0,0,0,0,2,0,6,0,0},
	     {0,0,7,3,0,0,9,0,0, 0,0,0, 0,0,0,0,0,3,0,0,5},
	     {0,5,0,0,9,0,0,6,3, 0,0,0, 0,0,8,0,0,0,0,4,0},

	     {0,8,0,0,7,3,0,0,0, 0,0,0, 0,4,0,3,0,0,8,0,0},
	     {0,0,6,2,0,0,8,0,0, 0,0,0, 7,0,0,0,9,0,5,0,0},
	     {4,0,0,5,0,0,0,9,0, 0,0,0, 0,0,0,0,5,0,0,7,0},

	     {0,3,0,0,5,0, 0,0,0,7,0,0,0,0,0, 0,0,1,0,0,0},
	     {0,0,8,0,0,9, 0,3,0,0,4,9,6,8,0, 4,0,0,2,0,0},
	     {0,0,9,0,0,0, 0,0,2,0,0,0,0,0,5, 0,0,0,0,8,0},

	     {0,0,0,0,0,0, 9,0,0,6,0,0,0,5,0, 0,0,0,0,0,0},
	     {0,0,0,0,0,0, 0,6,0,0,0,0,2,0,0, 0,0,0,0,0,0},
	     {0,0,0,0,0,0, 0,5,0,0,0,0,7,0,0, 0,0,0,0,0,0},

	     {0,0,0,0,3,0, 0,4,0,0,1,5,8,0,0, 0,0,6,0,0,0},
	     {0,0,0,9,0,0, 0,2,0,3,0,0,0,9,0, 0,0,4,0,0,6},
	     {0,0,2,0,0,0, 0,0,1,0,0,0,0,0,0, 0,0,8,0,2,0},

	     {0,0,0,3,0,0,0,5,0, 0,0,0, 0,0,0,0,4,0,3,0,0},
	     {7,0,0,0,1,9,0,0,0, 0,0,0, 0,0,0,5,0,0,7,0,0},
	     {0,6,0,0,0,0,2,0,0, 0,0,0, 3,5,6,0,0,0,0,8,0},

	     {3,0,0,2,9,0,0,7,0, 0,0,0, 0,0,0,2,6,0,0,0,1},
	     {0,0,5,0,0,4,0,0,8, 0,0,0, 0,0,3,0,0,5,0,0,0},
	     {0,8,0,0,0,0,0,0,0, 0,0,0, 0,7,0,0,0,0,9,0,0}};

	
       
	Samurai samurai = new Samurai();
      
	samurai.solve(puzzle1);
     
       

    }
    
    

    // Solve a puzzle.
    void solve(int[][] puzzle)
    {
	

	DancingLinks dL = new DancingLinks(puzzle);

	
	
      dL.solve(this);
      
    }

   

    int[][] report(int[][] solution)
      {
          Base.cozulenMatrix=solution;
          
          
	for (int r = 0; r < PUZZLE_SIDE; r++)
	{
	    for (int c = 0; c < PUZZLE_SIDE; c++)
		if (solution[r][c] > 0)
		   System.out.print(solution[r][c] + " ");
		else
		    System.out.print("- ");

	    System.out.println();
	}

	System.out.println("-----------------------------------------");
        
        for (int r = 0; r < PUZZLE_SIDE; r++)
	{
	    for (int c = 0; c < PUZZLE_SIDE; c++)
		if (solution[r][c] > 0)
		  // System.out.println("["+r+"]"+"["+c+"]= "+solution[r][c]);
                    txtYazdir.cozum+="["+r+"]"+"["+c+"]= "+solution[r][c]+"\n";
		

	   
	}
          txtYazdir.txtyeYaz(txtYazdir.cozum, "tumcozum");
        
        
        
        
        
        return solution;
    }



    static final int PUZZLE_SIDE = 21;
    static final int PUZZLE_SIZE = 441;
    static final int SUDOKU_SIDE = 9;
    static final int SUDOKU_SIZE = 81;
    static final int SQUARE_SIDE = 3;
    static final int COLUMN_SIZE = 1692;



    static final int[][] SAMURAI_SQUARE = 
    {{0}, {0},    {0},  {},    {1}, {1}, {1},
     {0}, {0},    {0},  {},    {1}, {1}, {1},
     {0}, {0}, {0, 2}, {2}, {1, 2}, {1}, {1},
      {},  {},    {2}, {2},    {2},  {},  {},
     {3}, {3}, {2, 3}, {2}, {2, 4}, {4}, {4},
     {3}, {3},    {3}, {},     {4}, {4}, {4},
     {3}, {3},    {3}, {},     {4}, {4}, {4}};

    static final int[][] SUDOKU_ROW =
    {{0, 1, 2, 3, 4, 5, 6, 7, 8},
     {0, 1, 2, 3, 4, 5, 6, 7, 8},
     {-1,-1,-1,-1,-1,-1, 0, 1, 2, 3, 4, 5, 6, 7, 8},
     {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1, 0, 1, 2, 3, 4, 5, 6, 7, 8},
     {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1, 0, 1, 2, 3, 4, 5, 6, 7, 8}};

    static final int[][] SUDOKU_COLUMN =
    {{0, 1, 2, 3, 4, 5, 6, 7, 8},
     {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1, 0, 1, 2, 3, 4, 5, 6, 7, 8},
     {-1,-1,-1,-1,-1,-1, 0, 1, 2, 3, 4, 5, 6, 7, 8},
     {0, 1, 2, 3, 4, 5, 6, 7, 8},
     {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1, 0, 1, 2, 3, 4, 5, 6, 7, 8}};



   class  DancingLinks
    {
	Samurai samurai;
	boolean stop;
	int[] stats;
	int index;
	Column h;
	Node[] o;

	
	 DancingLinks(int[][] p)
	{
	   

	    h = new Column(null, 0);
	    Column[] m = new Column[COLUMN_SIZE];

	   

	    for (int i = 0; i < COLUMN_SIZE; i++)
		m[i] = new Column(h, 0);

	   

	    Node[] l = new Node[PUZZLE_SIZE];
	    int i = 0;

	   

	    for (int r = 0; r < PUZZLE_SIDE; r++)
		for (int c = 0; c < PUZZLE_SIDE; c++)
		    for (int d = 0; d < SUDOKU_SIDE; d++)
		    {
			

			int k = 1 + (r * PUZZLE_SIDE * SUDOKU_SIDE) +
			    (c * SUDOKU_SIDE) + d;

			

			int s = (c / 3) + ((r / 3) * 7);

			

			if (SAMURAI_SQUARE[s].length > 0)
			{
			   
			    Node n = new Node(m[(r * PUZZLE_SIDE) + c], k);

			   

			    for (int j = 0; j < SAMURAI_SQUARE[s].length; j++)
			    {
				

				int pz = SAMURAI_SQUARE[s][j];

				

				int pr = SUDOKU_ROW[pz][r];
				int pc = SUDOKU_COLUMN[pz][c];

				

				n.add(new Node(m[PUZZLE_SIZE +
						 (pz * SUDOKU_SIZE) +
						 (pr * SUDOKU_SIDE) + d], k));

				
				n.add(new Node(m[PUZZLE_SIZE + 405 +
						 (pz * SUDOKU_SIZE) +
						 (pc * SUDOKU_SIDE) + d], k));
			    }

			   
			    n.add(new Node(m[PUZZLE_SIZE + 405 + 405 +
					     (s * SUDOKU_SIDE) + d], k));

			   

			    if (p[c][r] == (d + 1))
				l[i++] = n;
			}
		    }

	   
	    for (Column c = (Column) h.r; c != h; c = (Column) c.r)
		if (c.s == 0)
		    c.cover();

	   

	    o = new Node[PUZZLE_SIZE];

	   

	    for (int j = 0; j < i; j++)
	    {
		l[j].remove();
		o[index++] = l[j];
	    }

	   

	    stats = new int[PUZZLE_SIZE];
	}

	

	void report(int[] o)
	{
	   

	    int a[][] = new int[PUZZLE_SIDE][PUZZLE_SIDE];

	   

	    for (int i = 0; i < o.length; i++)
	    {
		int v = o[i];

		int d = v % SUDOKU_SIDE;
		int c = (v / SUDOKU_SIDE) % PUZZLE_SIDE;
		int r = (v / (PUZZLE_SIDE * SUDOKU_SIDE)) % PUZZLE_SIDE;

		a[c][r] = d + 1;
	    }
            

	   samurai.report(a);//SUDOKUNUN ÇÖZÜLMÜŞ HALİNİ YAZDIRIR.

	 
            int s[][] = new int[PUZZLE_SIDE][PUZZLE_SIDE];
                for (int i = 0; i < o.length; i++)
		s[i / PUZZLE_SIDE][i % PUZZLE_SIDE] = stats[i];
	 
	}

	

	void solve(Samurai s)
	{
	    samurai = s;
	    search(index);
	}

	
        
	void search(int k)
	{
	    

	    if (stop)
		return;

	   

	    if (h.r == h)
	    {
		int[] a = new int[k];

		

		for (int i = 0; i < k; i++)
		    a[i] = o[i].n - 1;

		

		report(a);
                
		stop = true;
	    }

	   

	    else
	    {
		Column c = null;
		int s = Integer.MAX_VALUE;

		

		stats[k]++;

		

		for (Column j = (Column) h.r; j != h; j = (Column) j.r)
		    if (s > j.s)
		    {
			c = j;
			s = j.s;
		    }

		

		c.cover();

		

		for (Node r = c.d; r != c; r = r.d)
		{
		   

		    if (stop)
			break;

		   

		    o[k] = r;

		    

		    for (Node j = r.r; j != r; j = j.r)
			j.c.cover();

		    

		    search(k + 1);

		    

		    for (Node j = r.l; j != r; j = j.l)
			j.c.uncover();
		}

		

		c.uncover();
	    }
	}
    }



    class Node
    {
	Node l;
	Node r;
	Node u;
	Node d;
	Column c;
	int n;

	

	Node(Column c, int n)
	{
	    this.l = this;
	    this.r = this;

	    this.u = this;
	    this.d = this;

	  

	    this.c = c;
	    this.n = n;

	  

	    if (c != null)
		c.add(this);
	}
 
	

	void remove()
	{
	    Node n = this;

	    

	    do
	    {
		n.c.cover();
		n = n.r;
	    }

	  

	    while (n != this);
	}

	

	void add(Node n)
	{
	    n.l = this.l;
	    n.r = this;

	    this.l.r = n;
	    this.l = n;
	}
    }



    class Column extends Node
    {
	int s;

	

	Column(Column c, int n)
	{
	    super(null, n);

	    if (c != null)
		c.add(this);
	}

	

	void cover()
	{
	   

	    r.l = l;
	    l.r = r;

	   

	    for (Node i = d; i != this; i = i.d)

		

		for (Node j = i.r; j != i; j = j.r)
		{
		 

		    j.u.d = j.d;
		    j.d.u = j.u;

		    

		    j.c.s--;
		}
	}

	

	void uncover()
	{
	   

	    for (Node i = u; i != this; i = i.u)

		

		for (Node j = i.l; j != i; j = j.l)
		{
		    

		    j.u.d = j;
		    j.d.u = j;

		    

		    j.c.s++;
		}

	    

	    r.l = this;
	    l.r = this;
	}

	

	void add(Column c)
	{
	    c.l = this.l;
	    c.r = this;

	    this.l.r = c;
	    this.l = c;
	}

	

	void add(Node n)
	{
	    n.u = this.u;
	    n.d = this;

	    this.u.d = n;
	    this.u = n;

	   
	    s++;
	}
    }
}