package com.newsOrganisation.hashTag;

import java.util.Arrays;

public class HashTags {
	public static String[] getHashTags(String str) {
		return Arrays.stream(str.toLowerCase().replaceAll("\\p{Punct}", "").split(" "))
				.sorted((s1, s2) -> s2.length() - s1.length()).limit(3).map(s -> "#" + s).toArray(String[]::new);
	}

}
