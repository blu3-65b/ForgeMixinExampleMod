package git.blu3.baseclient.event;

    /**
     * @author sl
     */
    public class Event {
        private boolean cancelled = false;

        public boolean isCancelled() {
            return cancelled;
        }

        public void setCancelled(boolean cancelled) {
            this.cancelled = cancelled;
        }
}
