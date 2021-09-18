package com.Hackthon.botshop.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.Hackthon.botshop.Fragmentss.OnlineChatFragment;
import com.Hackthon.botshop.Fragmentss.ChatsFragment;

public class FragmentAdapter extends FragmentPagerAdapter  {
    public FragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public FragmentAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0: return new ChatsFragment();
            case 1: return new OnlineChatFragment();
            default: return new ChatsFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        String title = null;
        if(position==0){
            title = "CHATS";
        }
        else if(position==1){
            title = "ONLINE";
        }

        return title;
    }
}
