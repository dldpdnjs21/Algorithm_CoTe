import java.io.*;
import java.util.*;

class Node implements Comparable<Node> {
    int end, weight;

    public Node(int end, int weight) {
        this.end = end;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node o) {
        return weight - o.weight;
    }
}

public class Main {
    static int V;
    static int E;
    static int startNode;
    static List<Node>[] graph;
    static int[] dist; // 시작 정점부터 각 정점까지의 최단 경로를 담는 1차원 배열

    public static void dijkstra() {
        PriorityQueue<Node> pq = new PriorityQueue<>();

        // 시작 정점을 우선순위 큐에 담고, 거리를 0으로 초기화 한다.
        pq.add(new Node(startNode, 0));
        dist[startNode] = 0;

        // 다익스트라 알고리즘 로직
        while(!pq.isEmpty()) {
            // 우선순위 큐에 가장 첫 번째 원소 값을 가져온다. && (BFS 기준) 큐에 첫 번째 원소 값을 가져온다.
            Node currentNode = pq.poll();

            // 현재 정점에서 갈 수 있는 정점과 해당 정점까지의 가중치 값을 가져온다.
            for(Node nextNode: graph[currentNode.end]) {
                int nextCost = currentNode.weight + nextNode.weight; // 현재 정점에서 다음 정점까지의 가중치 합계를 구한다.

                // 합계와 각 정점까지의 최단 경로와 비교를 한다.
                // 그런데, 합계가 더 낮을 경우에는 최단 경로의 값을 수정(저장)해준다.
                if(nextCost < dist[nextNode.end]) {
                    dist[nextNode.end] = nextCost;
                    pq.add(new Node(nextNode.end, nextCost));
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        // 입력 #1. V와 E가 주어진다. (V -> 정점의 개수 / E -> 간선의 개수)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        V = Integer.parseInt(st.nextToken()); // 정점의 개수
        E = Integer.parseInt(st.nextToken()); // 간선의 개수

        startNode = Integer.parseInt(br.readLine()); // 시작 정점

        // 그래프 -> 표현 2가지
        // 1. 인접 행렬 (2차원 배열)
        // 2. 인접 리스트 (연결 리스트)
        graph = new ArrayList[V + 1]; // 배열의 세로축 사이즈를 지정을 한거고


        dist = new int[V + 1]; // 거리를 담기위해서는 노드의 개수만큼의 크기가 필요하다.

        // 최단 거리를 구하기 위해서 거리를 저장하는 배열을 정수가 표현할 수 있는 가장 큰 값으로 배열을 초기화한다.
        Arrays.fill(dist, Integer.MAX_VALUE);

        // 각 인덱스의 값을 빈 배열로 담곗다.
        for(int i = 1; i <= V; i++){
            graph[i] = new ArrayList<>();
        }

        // 입력으로 주어지는 간선의 정보를 그래프로 표현한다.
        for(int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine()); // U, V, W의 값이 입력

            int from = Integer.parseInt(st.nextToken()); // A 정점을 가리키고
            int to = Integer.parseInt(st.nextToken()); // B 정점을 가리키고
            int cost = Integer.parseInt(st.nextToken()); // A 에서 B 까지의 거리를 나타내고

            graph[from].add(new Node(to, cost));
        }

        // 다익스트라 알고리즘을 호출한다.
        dijkstra();

        StringBuilder answer = new StringBuilder();

        for(int i = 1; i < V + 1; i++) {
            if(dist[i] == Integer.MAX_VALUE) answer.append("INF");
            else answer.append(dist[i]);
            answer.append("\n");
        }

        System.out.println(answer);
    }
}