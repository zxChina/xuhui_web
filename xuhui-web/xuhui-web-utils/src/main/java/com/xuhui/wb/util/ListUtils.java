package com.xuhui.wb.util;

import java.util.List;

public class ListUtils {

	public static boolean isEmpty(List<?> list) {
		if (list == null || list.size() == 0)
			return true;
		return false;
	}
}
