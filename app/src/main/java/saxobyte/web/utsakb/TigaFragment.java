package saxobyte.web.utsakb;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;



/**
 * A simple {@link Fragment} subclass.
 */
public class TigaFragment extends Fragment {


    public TigaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tiga, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        final String[] items = new String[] {"Muhammad Syahrul \n087873760115","Abdurrahman \n082273760615","Fajar Ikhsan \n0813432561999","Syamsul Huda \n 087873761615"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getActivity().getApplicationContext(), items[i] , Toast.LENGTH_SHORT).show();
            }
        });
        // Inflate the layout for this fragment
        return rootView;
    }

}
