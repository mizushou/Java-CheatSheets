package collections2.examples.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		new HashMapExample();
	}

	private HashMapExample() {
		Map<String, Translation> map = new HashMap<>();
		map.put("one", new Translation("uno"));
		map.put("two", new Translation("deux"));
		map.put("two", new Translation("dos"));
		map.put("three", new Translation("tres"));
		map.put("four", new Translation("cuatro"));
		map.put("five", new Translation("cinco"));
		map.put("six", new Translation("seis"));

		// note that map does not implement the Collection interface
		// we need to get the keySet, the values or the entrySet
		Collection<?> c = map.entrySet();

		CollectionUtil.display(c);
	}

	public class Translation {
		private String value;

		public Translation(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + ((value == null) ? 0 : value.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Translation other = (Translation) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (value == null) {
				if (other.value != null)
					return false;
			} else if (!value.equals(other.value))
				return false;
			return true;
		}

		private HashMapExample getOuterType() {
			return HashMapExample.this;
		}

		@Override
		public String toString() {
			return value;
		}

	}
}
