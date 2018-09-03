package com.capgemini.day7.domain;

import java.io.File;
import java.time.LocalDate;
import java.util.LinkedList;

public class Assignment {
	
		private File file;
		private LocalDate dueDate;

		private static LinkedList<Assignment> linked = new LinkedList<>();

		public Assignment() {
			super();
		}

		public Assignment(File file, LocalDate dueDate) {
			super();
			this.file = file;
			this.dueDate = dueDate;
		}

		public static boolean add(Assignment assign) {
			if (linked.add(assign)) {
				return true;
			}
			return false;
		}

		public static boolean remove(Assignment assign) {
			if (linked.remove(assign)) {
				return true;
			}
			return false;
		}

		public static void show() {
			for (Assignment assignments : linked) {
				System.out.println(assignments);
			}
		}

		public static Assignment fetchEarlyDueDate() {
			int result = 0;
			Assignment first = linked.getFirst();
			for (Assignment assignments : linked) {
				if (first.equals(assignments)) {
					continue;
				}
				result = assignments.dueDate.compareTo(first.dueDate);
				// System.out.println(result);
				if (result < 0) {
					first = assignments;
				}
			}
			System.out.println(first);
			return first;
		}

		@Override
		public String toString() {
			return "Assignments [assignmentName=" + file + ", dueDate=" + dueDate + "]";
		}
	

}
