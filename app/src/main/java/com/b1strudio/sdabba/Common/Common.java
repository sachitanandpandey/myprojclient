package com.b1strudio.sdabba.Common;

import com.b1strudio.sdabba.model.User;

/**
 * Created by sachitanand on 17/05/18.
 */

public class Common {
    public static User currentUser;

    public static String convertCodeToStatus(String status) {
        if(status.equals("0"))
            return "Placed";
        else if(status.equals("1"))
            return "On my way";
        else
            return "Shipped";
    }
}
