import java.lang.reflect.Type;

/**
 * @param <TOutput> Type of input instances.
 */
public interface IGenericConverter<TOutput> {
    /**
     * @param input
     * @param <TInput> Type of produced instance.
     * @return New instance of TInput type generated based on the given input.
     */
    <TInput> TOutput convertFrom(TInput input);

    /**
     * @param input The type to check
     * @return true if the specified type is supported
     */
    boolean isSupported(Type input);
}