package tsp;

public class TSPMain {
	public static final int INF = 1000000;
	/*
	int adj_mat[][] =  {	//���� ���
		{0,5,20,10,INF,INF,10,65},
		{5,0,22,12,INF,INF,12,54},
		{20,22,0,7,INF,INF,7,70},
		{10,12,7,0,30,20,0,72},
		{INF,INF,INF,30,0,8,30,INF},
		{INF,INF,INF,20,8,0,20,INF},
		{10,12,7,0,30,20,0,72},
		{65,54,70,72,INF,INF,72,0},
	};
	*/
	
	/*
	int adj_mat[][] = {
		{0,14,4,10,20},
		{14,0,7,8,7},
		{4,5,0,7,16},
		{11,7,9,0,2},
		{18,7,17,4,0},
	};
	*/
	
	int adj_mat[][] = {
			{0, 15, 41, 20, 14, INF ,INF},
			{15, 0, 45, 33, 35, INF, INF},
			{41, 45, 0, 16, 28, 32, INF},
			{20, 33, 16, 0, 38, 36, 43},
			{14, 35, 28, 38, 0 ,INF, 15 },
			{INF, INF, 32, 36, INF, 0, 25},
			{INF, INF, INF, 43, 15, 25, 0}

	};
	
	
	int at[] = {-1,-1,-1, -1, -1, -1, -1};	//���� �ð�
	int at_type[] = {0, 0, 0, 0, 0, 0, 0};	//0 : ���� �ð� ������ ����, 1: ���� �ð��� ���缭 ����
	int lt[] = {0, 10, 30, 10, 60, 30, 5};
	String name[] = {"��", "������", "ġ��", "����", "�б�", "�Ĵ�", "����������"};
	//*/
	
	/*
	int at[] = {-1,-1,-1,-1,-1};	//���� �ð�
	int at_type[] = {0,0,0,0,0};	//0 : ���� �ð� ������ ����, 1: ���� �ð��� ���缭 ����
	int lt[] = {0,0,0,0,0};
	String name[] = {"1��","2��","3��","4��","5��"};
	*/
	
	public static void main(String[] args) {
		TSPMain tspm = new TSPMain();
		
		TSP tsp = new TSP(tspm.adj_mat, tspm.at, tspm.at_type, tspm.lt, tspm.name, 0);
		Node best;
		best = tsp.tsp_func(0, 0);
		tsp.print_status(best, true);	
	}
}