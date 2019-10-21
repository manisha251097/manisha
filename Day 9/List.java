class List extends AbstractList {

    List() {
        super();
    }

    public void add(int item) {
        this.list[this.size] = item;
        this.size++;
        if(this.size == capacity) {
            resize();
        }
    }

    public int indexOf(int item){
        for(int i = 0; i < this.size; i++) {
            if(item == list[i]) {
                return i;
            }
        }
        return -1;
    }
}