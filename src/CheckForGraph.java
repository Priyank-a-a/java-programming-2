//Question 23 - check if graph is tree or not


import java.util.*;
public class CheckForGraph {
        private int vertices;    //total number of vertices is stored in this var
        private LinkedList<Integer> adjacency[]; //Adjacency List

        CheckForGraph(int v)
        {
            vertices = v;
            adjacency = new LinkedList[v];
            for (int i=0; i<v; ++i)
                adjacency[i] = new LinkedList();
        }

        //inserting edges to the graph
        void addingEdge(int v,int w)
        {
            adjacency[v].add(w);
            adjacency[w].add(v);
        }

        Boolean isCyclicUtil(int vertex, Boolean visited[], int parent)
        {
            visited[vertex] = true;
            Integer i;
            Iterator<Integer> it = adjacency[vertex].iterator();
            while (it.hasNext())
            {
                i = it.next();
                if (!visited[i])
                {
                    if (isCyclicUtil(i, visited, vertex))
                        return true;
                }
                else if (i != parent)
                    return true;
            }
            return false;
        }

        //method to check if the graph is tree or not
        Boolean isTree()
        {
            Boolean visited[] = new Boolean[vertices];
            for (int i = 0; i < vertices; i++)
                visited[i] = false;


            if (isCyclicUtil(0, visited, -1))
                return false;

            for (int u = 0; u < vertices; u++)
                if (!visited[u])
                    return false;

            return true;
        }


        public static void main(String args[])
        {
            CheckForGraph graph1 = new CheckForGraph(5);
            graph1.addingEdge(1, 0);
            graph1.addingEdge(0, 2);
            graph1.addingEdge(0, 3);
            graph1.addingEdge(3, 4);
            if (graph1.isTree())
                System.out.println("Created graph is a tree");
            else
                System.out.println("Created graph is not a tree");

            CheckForGraph graph2 = new CheckForGraph(5);
            graph2.addingEdge(1, 0);
            graph2.addingEdge(0, 2);
            graph2.addingEdge(2, 1);
            graph2.addingEdge(0, 3);
            graph2.addingEdge(3, 4);

            if (graph2.isTree())
                System.out.println("Created graph is a tree");
            else
                System.out.println("Created graph is not a tree");

        }}
