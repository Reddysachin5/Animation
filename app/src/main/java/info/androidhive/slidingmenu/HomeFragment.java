package info.androidhive.slidingmenu;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HomeFragment extends Fragment {
	
	public HomeFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        TextView labl = (TextView)rootView.findViewById(R.id.txtLabel);
        labl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

           /*     Fragment fragment= new CommunityFragment();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();

// Replace whatever is in the fragment_container view with this fragment,
// and add the transaction to the back stack

                transaction.replace(R.id.homefragment, fragment);

                transaction.addToBackStack(null);

// Commit the transaction
                transaction.commit();*/
                Intent i = new Intent(getActivity(),TrailRoot.class);
                getActivity().startActivity(i);
            }
        });
        return rootView;
    }
}
