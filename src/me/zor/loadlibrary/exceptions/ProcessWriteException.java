package me.zor.loadlibrary.exceptions;

public class ProcessWriteException extends  Exception {

    public ProcessWriteException(int pid)
    {
        super("Unable to write to process with PID: " + pid);
    }

}
