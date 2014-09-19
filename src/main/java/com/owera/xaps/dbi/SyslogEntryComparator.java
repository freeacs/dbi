package com.owera.xaps.dbi;

import java.util.Comparator;

public class SyslogEntryComparator implements Comparator<SyslogEntry> {

	public int compare(SyslogEntry o1, SyslogEntry o2) {
		if (o1.getCollectorTimestamp().getTime() > o2.getCollectorTimestamp().getTime())
			if (o1.getId().intValue()  > o2.getId())
				return -1;
			else
				return 1;
		if (o1.getCollectorTimestamp().getTime() < o2.getCollectorTimestamp().getTime())
			if (o1.getId().intValue()  < o2.getId())
				return 1;
			else
				return -1;
		return 0;
	}

}
